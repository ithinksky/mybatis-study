package com.ithinksky.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author tengpeng.gao
 */
public class UserEntity implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getUsername(), that.getUsername()) && Objects
                .equals(getPassword(), that.getPassword()) && Objects.equals(getAge(), that.getAge()) && Objects
                .equals(getBirthday(), that.getBirthday());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getUsername(), getPassword(), getAge(), getBirthday());
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\'' + ", " +
                "" + "age=" + age + ", birthday=" + birthday + '}';
    }
}
