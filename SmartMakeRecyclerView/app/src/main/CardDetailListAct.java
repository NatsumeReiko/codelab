
import android.os.Bundle;


public class CardDetailListAct extends BaseListAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @SuppressWarnings("unchecked")
    @Override
    protected void makeDate() {
        CDataType data001 = new CDataType();
        data001.dataType = Constant.CARD_TYPE_001;

        dataList.add(data001);

        CDataType data002 = new CDataType();
        data002.dataType = Constant.CARD_TYPE_002;

        dataList.add(data002);

    }

    @Override
    protected boolean isFullScreenMode() {
        return true;
    }


}
