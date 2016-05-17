package models.security;

import com.avaje.ebean.config.EncryptKey;

public class CustomEncryptKey implements EncryptKey {

    private String tableName;

    private String columnName;

    public CustomEncryptKey(String tableName, String columnName) {
        this.tableName = tableName;
        this.columnName = columnName;
    }

    @Override
    public String getStringValue() {
        return play.Configuration.root().getString("application.secret") + "::" + this.tableName
                + "::" + this.columnName;
    }
}
