package services.user;

import models.entity.User;
import services.ModelService;

import java.util.Optional;

public class UserModelService implements ModelService<User> {

    public static UserModelService use() {
        return new UserModelService();
    }

    @Override
    public Optional<User> save(User entry) {
        Optional<User> entryOps = Optional.ofNullable(entry);
        if (entryOps.isPresent()) {
            entry.save();
            return Optional.ofNullable(entry);
        }
        return Optional.empty();
    }

}
