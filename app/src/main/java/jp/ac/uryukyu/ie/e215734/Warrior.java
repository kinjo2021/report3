package jp.ac.uryukyu.ie.e215734;

public class Warrior extends LivingThing{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public int getHitPoint(){
        return this.hitPoint ;
    }

    public void attackWithWeponSkill(LivingThing a){
        int damage = (int)(attack*1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, a.name, damage);
        a.wounded(damage);

    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <=0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
