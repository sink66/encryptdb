package models.entity;

import com.avaje.ebean.annotation.Encrypted;

import javax.persistence.Entity;

/**
 * ユーザー情報
 *
 * @author
 *
 */
@Entity
public class User extends BaseEntity {

    /* ユーザー名 */
    @Encrypted
    public String name;

    /* メールアドレス */
    @Encrypted
    public String mail;

    /* パスワード */
    @Encrypted
    public String password;

    public static Finder<Long, User> finder = new Finder<Long, User>(User.class);

}
