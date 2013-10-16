package biz.ezcom.spring.aop.validater;

import biz.ezcom.spring.aop.bean.User;

public class IntroductionValidater implements IIntroductionValidater {
    @Override
    public boolean validate(User user) {
        System.out.println(this.getClass().getSimpleName() + ".validate(" + user + ")=======================================");
        if(user.getId() == null || user.getId() < 0) {
            return false;
        }
        if(user.getUsername() == null || user.getUsername().length() > 4) {
            return false;
        }
        if(user.getPassword() == null || user.getUsername().length() > 4) {
            return false;
        }
        return true;
    }
}
