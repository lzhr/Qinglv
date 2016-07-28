package io.github.lzhr.qinglv.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import io.github.lzhr.qinglv.R;
import io.github.lzhr.qinglv.bean.Customer;

public class SugarTestActivity extends AppCompatActivity {

    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_test);
        textView1.findViewById(R.id.textView1);
        textView1.setText(c().getSex());

    }

    public Customer c(){
        Customer c1 = new Customer("1","陈建伟","男",123,1);
        c1.save();

        List<Customer> c= Customer.find(Customer.class,"name= ? ","陈建伟");
       return  c.get(0);
    }
}
