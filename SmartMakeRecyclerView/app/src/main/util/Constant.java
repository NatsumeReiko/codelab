
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Constant {
    private Constant() {
    }

    /*++++++group stat++++++*/
    public static final int CARD_TYPE_001 = 1;
    public static final int CARD_TYPE_002 = CARD_TYPE_001 + 1;


    @IntDef({CARD_TYPE_001,
            CARD_TYPE_002
    })
    @Retention(RetentionPolicy.SOURCE)

    public @interface CardType {
    }
    /*++++++group end++++++*/


}
