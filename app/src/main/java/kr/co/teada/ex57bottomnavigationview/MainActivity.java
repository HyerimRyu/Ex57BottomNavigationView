package kr.co.teada.ex57bottomnavigationview;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 참조변수 연결
        bnv=findViewById(R.id.bnv);
        //2. 리스너 달기
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                //4. 버튼 눌었을 때 작업
                switch(menuItem.getItemId()){
                    case R.id.menu_aa:  //원래는 case 밑에 fragment 를 바꾸는거
                        findViewById(R.id.container).setBackgroundColor(Color.BLUE);  //자바에서 컬러는 알파값도 줘야해
                        break;
                    case R.id.menu_bb:
                        findViewById(R.id.container).setBackgroundColor(Color.LTGRAY);
                        break;
                    case R.id.menu_cc:
                        findViewById(R.id.container).setBackgroundColor(Color.CYAN);
                        break;
                    case R.id.menu_dd:
                        findViewById(R.id.container).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        break;
                }

                //3. 리턴값이 true 가 아니면 선택은 되지만 선택효과가 이동하지 않음
                return true;
            }
        });
    }
}
