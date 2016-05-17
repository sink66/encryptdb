package models.security;


import com.avaje.ebean.config.EncryptKey;
import com.avaje.ebean.config.EncryptKeyManager;

public class BasicEncryptKeyManager implements EncryptKeyManager {

    @Override
    public EncryptKey getEncryptKey(String tableName, String columnName) {
        return new CustomEncryptKey(tableName, columnName);
    }

    @Override
    public void initialise() {
        // Do nothing (yet)
    }

}
