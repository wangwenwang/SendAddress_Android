package tms_android.cy_scm.com.senaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fds(View view) {

        Intent bls = new Intent(MainActivity.this, YBMyAddressAdd2.class);
        startActivityForResult(bls, 110);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if ((requestCode == 110) && (resultCode == 120)) {
            String addressDetail = data.getExtras().getString("addressDetail");;

            TextView addressText = (TextView) findViewById(R.id.addressText);
            addressText.setText(addressDetail);
        }
    }
}