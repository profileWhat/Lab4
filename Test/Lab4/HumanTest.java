package Lab4;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    public void initTest() {
        NormalHuman normalHuman = new NormalHuman("Josh",new Theatre(20));
        assertEquals(normalHuman.getHumanName(),"Josh");
        assertEquals(normalHuman.getCurrentLocation(),LocationType.THEATRE);
        assertEquals(normalHuman.getHumanType(),HumanType.NORMAL_HUMAN);
    }
    @Test
    public void initTest2() {
        Actor actor = new Actor("Josh",new Theatre(20));
        assertEquals(actor.getHumanName(),"Josh");
        assertEquals(actor.getCurrentLocation(),LocationType.THEATRE);
        assertEquals(actor.getHumanType(),HumanType.ACTOR);
    }
    @Test
    public void speakTest() {
        NormalHuman normalHuman = new NormalHuman("Josh",new Theatre(20));
        normalHuman.speak();
        boolean expRes = true;
        boolean actRes = normalHuman.isSpeak();
        assertEquals(expRes,actRes);
    }

    @Test
    public void stopSpeakTest() {
        NormalHuman normalHuman = new NormalHuman("Josh",new Theatre(20));
        normalHuman.stopSpeak();
        boolean expRes = false;
        boolean actRes = normalHuman.isSpeak();
        assertEquals(expRes,actRes);
    }
    @Test
    public void setClothingTest() {
        NormalHuman normalHuman = new NormalHuman("Josh",new Theatre(20));
        normalHuman.setClothing(new Stick(), new Crown("Iron"), new Curtain());
        Item[] clothing = {new Crown("Iron")};
        class Clothing {
            Clothing(Item[] clothing) {
                this.clothing = clothing;
            }
            private Item[] clothing;
            @Override
            public boolean equals(Object obj) {
                if(obj == null || obj.getClass() != this.getClass())
                    return false;
                if(this == obj)
                    return true;
                Clothing other = (Clothing)obj;
                return(this.hashCode() == other.hashCode());
            }
            @Override
            public String toString() {
                return getClass().getName();
            }
            @Override
            public int hashCode() {
                int hash = 0;
                for(Item item: clothing) {
                    if (item != null)
                    hash += item.hashCode();
                }
                return hash;
            }
        }
        Clothing clothingHuman = new Clothing(normalHuman.getClothing());
        Clothing clothingNeed = new Clothing(clothing);
        assertEquals(clothingHuman, clothingNeed);
    }
}