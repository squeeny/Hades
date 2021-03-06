package Hades.chr;

import com.brashmonkey.spriter.Animation;
import com.brashmonkey.spriter.Player;

public class chr_hades_listener implements Player.PlayerListener {
    private chr_hades character;
    public chr_hades_listener(chr_hades character) {
        this.character = character;
    }
    public void animationFinished(Animation animation){
        if (animation.name.equals("Defeat")) { character.stopAnimation(); }
        else if (!animation.name.equals("Idle")) { character.resetAnimation(); }
    }

    public void animationChanged(Animation var1, Animation var2){ }
    public void preProcess(Player var1){ }
    public void postProcess(Player var1){ }
    public void mainlineKeyChanged(com.brashmonkey.spriter.Mainline.Key var1, com.brashmonkey.spriter.Mainline.Key var2){ }
}
