package br.com.gmp.desktop.app;

import br.com.gmp.ejb.entity.Profile;
import br.com.gmp.ejb.entity.UserBase;
import br.com.gmp.ejb.entity.UserInfo;

/**
 *
 * @author kaciano
 */
public class Session {

    private UserInfo user;
    private Profile profile;

    /**
     *
     */
    public Session() {
        start();
    }

    /**
     *
     * @param user
     * @param profile
     */
    public Session(UserInfo user, Profile profile) {
        this.user = user;
        this.profile = profile;
        start();
    }

    private void start() {

    }

    public void login() {

    }

    public void logout() {

    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

}
