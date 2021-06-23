package communi.dog.ex7_postpc;

import android.content.Context;
import android.content.SharedPreferences;

public class MyLocalDb {

    private final SharedPreferences sp;

    public MyLocalDb(Context context){
        this.sp = context.getSharedPreferences("", Context.MODE_PRIVATE);
    }
}
