/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisunirb;

public class Professor {

    String fullname;
    private int mat;
    private int age;

    public Professor(String fullname, int mat, int age) {
        this.fullname = fullname;
        this.mat = mat;
        this.age = age;
    }

    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the mat
     */
    public int getMat() {
        return mat;
    }

    /**
     * @param mat the mat to set
     */
    public void setMat(int mat) {
        this.mat = mat;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
