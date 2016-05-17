package models.form;

import play.data.validation.Constraints.Required;

/**
 * ユーザー登録用フォームクラス
 *
 * @author
 *
 */
public class NewUserForm {

    /* ユーザー名 */
    @Required
    public String name;

    /* メールアドレス */
    @Required
    public String mail;

    /* パスワード */
    @Required
    public String password;

}
