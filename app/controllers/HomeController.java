package controllers;

import javax.inject.Inject;

import models.entity.User;
import models.form.NewUserForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import services.user.UserService;
import views.html.*;

import views.html.user.create;
import views.html.user.show;

import java.util.Optional;

/**
 * Controller
 */
public class HomeController extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    UserService userService;

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result create() {
        return ok(create.render(formFactory.form(NewUserForm.class)));
    }

    public Result doCreate() {

        Form<NewUserForm> formData = formFactory.form(NewUserForm.class).bindFromRequest();
        if (formData.hasErrors()) {
            return badRequest("form error");
        }

        Optional<User> userOps = userService.create(formData.get());
        Optional<Result> result = userOps.map(user -> {
            return ok(show.render(user));
        });

        return result.orElse(badRequest("create error"));
    }

}
