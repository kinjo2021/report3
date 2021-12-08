package jp.ac.uryukyu.ie.e215734;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {

    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demohyperHero = new Warrior("ハイパーデモ勇者", defaultHeroHp, 10);
        Enemy slime = new Enemy("スライムもどき", defaultHeroHp, 10);
        for(int count=1; count<4; count++){
            int HP = defaultHeroHp;
            demohyperHero.attackWithWeponSkill(slime); 
            assertEquals(10*1.5*count, HP - slime.hitPoint);
        }
    }
    
}
