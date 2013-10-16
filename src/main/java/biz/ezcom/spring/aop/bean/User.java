package biz.ezcom.spring.aop.bean;

import biz.ezcom.spring.aop.annotation.ParameterUserAnnotation;

@ParameterUserAnnotation
public final class User {
    private Integer id;
    private String  username;
    private String  password;

    public User() {}

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.username + " : " + this.password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (!this.getId().equals(user.getId())) {
            return false;
        }
        if (!this.getUsername().equals(user.getUsername())) {
            return false;
        }
        if (!this.getPassword().equals(user.getPassword())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 3 * this.getId().hashCode() + 5 * this.getUsername().hashCode() + 7 * this.getPassword().hashCode();
    }
}
