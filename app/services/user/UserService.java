package services.user;

import models.entity.User;
import models.form.NewUserForm;

import java.util.Optional;

/**
 * Created by fairy on 2016/05/17.
 */
public class UserService {

    public static UserService use() {
        return new UserService();
    }

    /**
     * ユーザー登録処理
     *
     * @param entry
     * @return
     */
    public Optional<User> create(NewUserForm entry) {

        // ユーザー新規作成処理
        User user = new User();
        user.name = entry.name;
        user.mail = entry.mail;
        user.password = entry.password;

        return UserModelService.use().save(user);

    }

}