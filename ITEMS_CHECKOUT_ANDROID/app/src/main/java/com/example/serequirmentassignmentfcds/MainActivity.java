package com.example.serequirmentassignmentfcds;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String chs = "";
    private String trk = "";
    private String crm = "";

    private ArrayList<String> data1 = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();
    private ArrayList<String> data4 = new ArrayList<String>();
    private TableLayout table;
    EditText edi1;
    CheckBox ch1, ch2, ch3;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        edi1 = findViewById(R.id.txtsub);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = 0;
                for ( int a=0; a<data4.size();a++ ){
                 sum = sum+ Integer.parseInt(data4.get(a).toString());
                }
                edi1.setText(String.valueOf(sum));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sales();

            }
        });


    }

    public void sales() {
        if (ch1.isChecked()) {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("enter the quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);
            builder.setPositiveButton("ok", (dialog, which) -> {
                String trky = ch1.getText().toString();
                int price1 = 100;
                chs = input.getText().toString();
                int tot = price1 * Integer.parseInt(chs);
                data1.add(trky);
                data2.add(String.valueOf(price1));
                data3.add(String.valueOf(chs));
                data4.add(String.valueOf(tot));
                TableLayout table = (TableLayout) findViewById(R.id.tb1);
                String total;
                for (int i = 0; i < data1.size(); i++) {
                    String pname = data1.get(i);
                    String price = data2.get(i);
                    String quantity = data3.get(i);
                    total = data4.get(i);
                    t1.setText(pname);
                    t2.setText(price);
                    t3.setText(quantity);
                    t4.setText(total);
                }
                row.addView(t1);
                row.addView(t2);
                row.addView(t3);
                row.addView(t4);
                table.addView(row);


            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.show();

        }
        else if (ch2.isChecked()) {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("enter the quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);
            builder.setPositiveButton("ok", (dialog, which) -> {
                String meat = ch2.getText().toString();
                int price2 = 200;
                trk = input.getText().toString();
                int tot = price2 * Integer.parseInt(trk);
                data1.add(meat);
                data2.add(String.valueOf(price2));
                data3.add(String.valueOf(trk));
                data4.add(String.valueOf(tot));
                TableLayout table = (TableLayout) findViewById(R.id.tb1);
                String total;
                for (int i = 0; i < data1.size(); i++) {
                    String pname = data1.get(i);
                    String price = data2.get(i);
                    String quantity = data3.get(i);
                    total = data4.get(i);
                    t1.setText(pname);
                    t2.setText(price);
                    t3.setText(quantity);
                    t4.setText(total);
                }
                row.addView(t1);
                row.addView(t2);
                row.addView(t3);
                row.addView(t4);
                table.addView(row);


            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.show();

        }
        else if (ch3.isChecked()) {
            final TableRow row = new TableRow(this);
            final TextView t1 = new TextView(this);
            final TextView t2 = new TextView(this);
            final TextView t3 = new TextView(this);
            final TextView t4 = new TextView(this);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("enter the quantity");
            final EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);
            builder.setPositiveButton("ok", (dialog, which) -> {
                String trky = ch3.getText().toString();
                int price3 = 50;
                crm = input.getText().toString();
                int tot = price3 * Integer.parseInt(crm);
                data1.add(trky);
                data2.add(String.valueOf(price3));
                data3.add(String.valueOf(crm));
                data4.add(String.valueOf(tot));
                TableLayout table = (TableLayout) findViewById(R.id.tb1);
                String total;
                for (int i = 0; i < data1.size(); i++) {
                    String pname = data1.get(i);
                    String price = data2.get(i);
                    String quantity = data3.get(i);
                    total = data4.get(i);
                    t1.setText(pname);
                    t2.setText(price);
                    t3.setText(quantity);
                    t4.setText(total);
                }
                row.addView(t1);
                row.addView(t2);
                row.addView(t3);
                row.addView(t4);
                table.addView(row);


            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.show();

        }

    }
}
