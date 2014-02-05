package br.com.gmp.utils.test;

/**
 * Objeto de testes
 *
 * @author kaciano
 */
public class Test {

    private String name;
    private int age;
    private boolean alive;

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

}
