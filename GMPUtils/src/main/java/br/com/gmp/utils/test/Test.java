package br.com.gmp.utils.test;

import br.com.gmp.utils.annotations.TreeItem;
import br.com.gmp.utils.annotations.TreeLeaf;

/**
 * Objeto de testes
 *
 * @author kaciano
 */
@TreeItem(title = "Test")
public class Test {

    @TreeLeaf
    private String name;
    @TreeLeaf
    private int age;
    @TreeLeaf
    private boolean alive;    
    private Test test;

    /**
     * Constroi novo Test
     *
     * @param name Nome
     * @param age Idade
     * @param alive Vivo?
     */
    public Test(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public Test(String name, int age, boolean alive, Test test) {
        this.name = name;
        this.age = age;
        this.alive = alive;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Teste{" + "name=" + name + ", age=" + age + ", vivo=" + alive + '}';
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     *
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     *
     * @return
     */
    public Test getTest() {
        return test;
    }

    /**
     *
     * @param test
     */
    public void setTest(Test test) {
        this.test = test;
    }

}
