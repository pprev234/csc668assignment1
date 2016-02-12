/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1.Resources;

import csc668assignment1.Product;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author axelanconaesselmann
 */
public class FileProductsResource implements ProductsResourceInterface {
    private String _currentUpc;
    private String _currentText;
    private float _currentPrice;
    private BufferedReader _fileHandler;

    public FileProductsResource (String fileName) throws ResourceException {
        Path path = FileSystems.getDefault().getPath(fileName);
        try {
            _fileHandler = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ResourceException resouceException = new ResourceException();
            resouceException.setMessage("File '" + path.toAbsolutePath().toString() + "' not found.");
            throw resouceException;
        }
    }
    
    @Override
    public boolean hasNext() {
        String line   = null;
        
        _currentUpc   = null;
        _currentText  = null;
        _currentPrice = 0;
        try {
            line = _fileHandler.readLine();
//            System.out.print(_fileHandler);
            if (line != null) {
//                System.out.print(line);
                _currentUpc   = line.substring(0,4);
                _currentText  = line.substring(9,29);
                _currentPrice = Float.parseFloat(line.substring(34,41));
                return true;
            }
        } catch (IOException ex) {
            return false;
        }
        return false;
    }

    @Override
    public String getUPC() {
        return _currentUpc;
    }

    @Override
    public String getDescription() {
        return _currentText;
    }

    @Override
    public float getPrice() {
        return _currentPrice;
    }

    @Override
    public void printProduct(Product product) {
        System.out.print("\n" + product.getUPC() + "\n");
    }
    
}
