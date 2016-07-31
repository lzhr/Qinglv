package io.github.lzhr.qinglv.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.List;

import io.github.lzhr.qinglv.R;
import io.github.lzhr.qinglv.bean.Customer;

public class SugarTestActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
       // SugarContext.init(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_test);
        EditText text=(EditText) super.findViewById(R.id.editText);
        text.setText(c().getName());
    }



    public Customer c(){
        Customer c1 = new Customer("1","陈建伟","男",123,1);
        c1.save();

        List<Customer> c= Customer.find(Customer.class,"name= ? ","陈建伟");
        return  c.get(0);
    }
}
