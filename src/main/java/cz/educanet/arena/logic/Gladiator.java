package cz.educanet.arena.logic;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String Name;
    private int HP;
    private int MaxDamage;
    private int MinDamage;
    private int Damage;

    // TODO: Add the rest of the properties
    // TODO: Generate/create getters and setters for these properties

    /**
     * @return true if hp is <= 0, else false
     */
    public boolean isDead() {
        // TODO:
        return HP <= 0;
    }

    /**
     * Generates a random value between min. damage and max. damage and deals it to the enemy.
     * @param enemy Enemy gladiator
     */
    public void dealDamage(Gladiator enemy) {
        // TODO:
        int randomdmg = (int) (Math.random() * (MaxDamage - MinDamage) + MinDamage);
        setDamage(randomdmg);
        enemy.setHP(enemy.getHP()-Damage);
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int currentHP) {
        this.HP = HP;
    }
    public int getmaxHP() {
        return HP;
    }
    public void setMaxHP(int maxHP) {
        this.HP = maxHP;
        this.HP = maxHP;
    }
    public int getDamage() {
        return Damage;
    }
    public void setDamage(int Damage) {
        this.Damage = Damage;
    }
    public int getMaxDamage(){
        return MaxDamage;
    }
    public void setMaxDamage(int maxDamage) {
        this.MaxDamage = maxDamage;
    }
    public int getMinDamage() {
        return MinDamage;
    }
    public void setMinDamage(int minDamage) {
        this.MinDamage= minDamage;
    }
}