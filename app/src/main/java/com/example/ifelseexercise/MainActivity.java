package com.example.ifelseexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7,
            editText8, editText9, editText10, editText11, editText12, editText13, edtringle1, edtringle2, edtringle3,
            editText14a, editText14b, editText14c, editText15buy, editText15sell, editText16phy, editText16chem, editText16math;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            button10, button11, button12, button13, button14, button15, button16;
    private TextView tvDisplay1, tvDisplay2, tvDisplay3, tvDisplay4, tvDisplay5, tvDisplay6,
            tvDisplay7, tvDisplay8, tvDisplay9, tvDisplay10, tvDisplay11, tvDisplay12, tvDisplay13, tvDisplay14,
            tvDisplay15, tvDisplay16;
    private String sNum1, sNum2, sNum3, sNum4, obalphabet, sNnum5, sNum6, sVowelCon, scalpha, sUpperLower, sWeek, sMonth, sAmount, sAngle1, sAngle2, sAngle3,
            s2angle1, s2angle2, s2angle3, sbuyPrice, sSellPrice, sPhysics, sChemistry, sMath;
    private int num1,  num2, num3, num4, num6, week, month, amount, sumAngle, angle1, angle2, angle3, angle2a, angle2b, angle2c,
            buyPrice, sellPrice, profitorloss, physics, chemistry, math;
    private int note500 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0, note2 = 0, note1 = 0;
    private double num5, totalresult;
    private char ch, chvc, chalph, chupperlower;

    // extra
    private boolean isLeap = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //For Problem 1
        editText1 = findViewById(R.id.edtlmaxNumber1Id);
        editText2 = findViewById(R.id.edtlmaxNumber2Id);
        button1 = findViewById(R.id.btn1);
        tvDisplay1 = findViewById(R.id.tvDisplayId1);


        //For Problem 2
        editText3 = findViewById(R.id.edtevenoddId);
        button2 = findViewById(R.id.btn2);
        tvDisplay2 = findViewById(R.id.tvDisplayId2);


        // For Problem 3

        editText4 = findViewById(R.id.edtleapyearId);
        button3 = findViewById(R.id.btn3);
        tvDisplay3 = findViewById(R.id.tvDisplayId3);

        // For Problem 4
        editText5 = findViewById(R.id.edtalphaetId);
        button4 = findViewById(R.id.btn4);
        tvDisplay4 = findViewById(R.id.tvDisplayId4);


        // For Problem 5
        editText6 = findViewById(R.id.edtpostivitveId);
        button5 = findViewById(R.id.btn5);
        tvDisplay5 = findViewById(R.id.tvDisplayId5);


        // For Problem 5
        editText7 = findViewById(R.id.edtdivisable5ana11Id);
        button6 = findViewById(R.id.btn6);
        tvDisplay6 = findViewById(R.id.tvDisplayId6);


        // For Problem 7

        editText8 = findViewById(R.id.edvowelId);
        button7 = findViewById(R.id.btn7);
        tvDisplay7 = findViewById(R.id.tvDisplayId7);


        // For Problem 8
        editText9 = findViewById(R.id.edtalpdigitspecialId);
        button8 = findViewById(R.id.btn8);
        tvDisplay8 = findViewById(R.id.tvDisplayId8);


        // For Problem 9
        editText10 = findViewById(R.id.edtupperlowerId);
        button9 = findViewById(R.id.btn9);
        tvDisplay9 = findViewById(R.id.tvDisplayId9);


        // For Problem 10
        editText11 = findViewById(R.id.edtweekCoountId);
        button10 = findViewById(R.id.btn10);
        tvDisplay10 = findViewById(R.id.tvDisplayId10);


        // For Problem 11
        editText12 = findViewById(R.id.edtmontcountId);
        button11 = findViewById(R.id.btn11);
        tvDisplay11 = findViewById(R.id.tvDisplayId11);


        // For Problem 12
        editText13 = findViewById(R.id.edtamountId);
        button12 = findViewById(R.id.btn12);
        tvDisplay12 = findViewById(R.id.tvDisplayId12);


        // For Problem 13
        edtringle1 = findViewById(R.id.edtriandgle1);
        edtringle2 = findViewById(R.id.edtriandgle2);
        edtringle3 = findViewById(R.id.edtriandgle3);
        button13 = findViewById(R.id.btn13);
        tvDisplay13 = findViewById(R.id.tvDisplayId13);

        // For Problem 14
        editText14a = findViewById(R.id.edtriandgle2a);
        editText14b = findViewById(R.id.edtriandgle2b);
        editText14c = findViewById(R.id.edtriandgle2c);
        button14 = findViewById(R.id.btn14);
        tvDisplay14 = findViewById(R.id.tvDisplayId14);

        // For Problem 15
        editText15buy = findViewById(R.id.edtbuypriceId);
        editText15sell = findViewById(R.id.edtsellpriceId);
        button15 = findViewById(R.id.btn15);
        tvDisplay15 = findViewById(R.id.tvDisplayId15);

        // For Problem 16
        editText16phy = findViewById(R.id.physicsId);
        editText16chem = findViewById(R.id.chamestryId);
        editText16math = findViewById(R.id.mathId);
        button16 = findViewById(R.id.btn16);
        tvDisplay16 = findViewById(R.id.tvDisplayId16);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sNum1 = editText1.getText().toString();
                sNum2 = editText2.getText().toString();
                num1 = Integer.parseInt(sNum1);
                num2 = Integer.parseInt(sNum2);

                if (num1 > num2) {
                    tvDisplay1.setText(num1 + " is Maximum between " + num1 + " and " + num2);
                } else {
                    tvDisplay1.setText(num2 + " is Maximum between " + num1 + " and " + num2);

                }


            }
        });




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sNum3 = editText3.getText().toString();
                num3 = Integer.parseInt(sNum3);


                if (num3 % 2 != 0) {
                    tvDisplay2.setText(num3 + " is an Odd number");
                } else {
                    tvDisplay2.setText(num3 + " is an Even number");
                }

            }
        });




        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sNum4 = editText4.getText().toString();
                num4 = Integer.parseInt(sNum4);




                if ((num4 % 4 == 0) && (num4 % 100 !=0) || (num4 % 400 == 0)) {
                    tvDisplay3.setText("Wow! you are born in a Leap year!");
                } else {
                    tvDisplay3.setText("No. You are born in a common year");
                }



            /*

                if(num4 % 4 == 0)
                {
                    if( num4 % 100 == 0)
                    {
                        if ( num4 % 400 == 0)
                            isLeap = true;
                        else
                            isLeap = false;
                    }
                    else
                        isLeap = true;
                }
                else {
                    isLeap = false;
                }


                if(isLeap==true) {
                    tvDisplay3.setText("Wow! you are born in a Leap year!");
                } else {
                    tvDisplay3.setText("No. You are born in a common year");
                }
            */


            }
        });





        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                obalphabet = editText5.getText().toString();
                ch = obalphabet.charAt(0);
                if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    tvDisplay4.setText("This is alphabet");
                } else {
                    tvDisplay4.setText("This is not alphabet");
                }


            }
        });




        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNnum5 = editText6.getText().toString();
                num5 = Double.parseDouble(sNnum5);

                if (num5 < 0) {
                    tvDisplay5.setText("It is Negative number");
                }
                if (num5 > 0) {
                    tvDisplay5.setText("It is a Positive number");
                }
                if (num5 == 0) {
                    tvDisplay5.setText("It is zero");
                }

            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum6 = editText7.getText().toString();
                num6 = Integer.parseInt(sNum6);

                if ((num6 % 11 == 0) && (num6 % 5 == 0)) {
                    tvDisplay6.setText("Number is divisible by 5 and 11");
                } else {
                    tvDisplay6.setText("Number is not divisible by 5 and 11");
                }

            }
        });



        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sVowelCon = editText8.getText().toString();
                chvc = sVowelCon.charAt(0);

                if (chvc == 'a' || chvc == 'A' || chvc == 'e' || chvc == 'E' || chvc == 'i' || chvc == 'I' || chvc == 'o' || chvc == 'O' || chvc == 'u' || chvc == 'U') {
                    tvDisplay7.setText("It is a vowel");
                } else {
                    tvDisplay7.setText("It is a consonant");
                }


            }
        });



        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scalpha = editText9.getText().toString();
                chalph = scalpha.charAt(0);

                if ((chalph >= 'a' && chalph <= 'z') || (chalph >= 'A' && chalph <= 'Z')){
                    tvDisplay8.setText("It is alphabet");
                } else if (chalph >= '0' && chalph <= '9'){
                    tvDisplay8.setText("It is digit");
                } else {
                    tvDisplay8.setText("It is a special character");
                }


            }
        });



        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sUpperLower = editText10.getText().toString();
                chupperlower = sUpperLower.charAt(0);

                if (chupperlower >= 'A' && chupperlower <= 'Z'){
                    tvDisplay9.setText(chupperlower + " is UpperCase");
                }
                if (chupperlower >= 'a' && chupperlower <= 'z'){
                    tvDisplay9.setText(chupperlower + " is LowerCase");
                }


            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sWeek = editText11.getText().toString();
                week = Integer.parseInt(sWeek);

                if (week >=1 && week <= 7) {
                    if (week == 1) {
                        tvDisplay10.setText("Saturday");
                    }
                    if (week == 2) {
                        tvDisplay10.setText("Sunday");
                    }
                    if (week == 3) {
                        tvDisplay10.setText("Monday");
                    }
                    if (week == 4) {
                        tvDisplay10.setText("Tuesday");
                    }
                    if (week == 5) {
                        tvDisplay10.setText("Wednesday");
                    }
                    if (week == 6) {
                        tvDisplay10.setText("Thursday");
                    }
                    if (week == 7) {
                        tvDisplay10.setText("Friday");
                    }
                } else {
                    tvDisplay10.setText("Invalid input! Please enter day number between (1-7)");
                }

            }
        });



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                sMonth = editText12.getText().toString();
                month = Integer.parseInt(sMonth);

                if (month >=1 && month <= 12) {
                    if (month == 1) {
                        tvDisplay11.setText("January has 31 days");
                    }
                    if (month == 2) {
                        tvDisplay11.setText("Fabruary has 28/29 days");
                    }
                    if (month == 3) {
                        tvDisplay11.setText("March has 31 days");
                    }
                    if (month == 4) {
                        tvDisplay11.setText("April has 30 days");
                    }
                    if (month == 5) {
                        tvDisplay11.setText("May has 31 days");
                    }
                    if (month == 6) {
                        tvDisplay11.setText("June has 30 days");
                    }
                    if (month == 7) {
                        tvDisplay11.setText("July has 31 days");
                    }
                    if (month == 8) {
                        tvDisplay11.setText("August has 31 days");
                    }
                    if (month == 9) {
                        tvDisplay11.setText("September has 30 days");
                    }
                    if (month == 10) {
                        tvDisplay11.setText("October has 31 days");
                    }
                    if (month == 11) {
                        tvDisplay11.setText("Noverber has 30 days");
                    }
                    if (month == 12) {
                        tvDisplay11.setText("December has 31 days");
                    }
                } else {
                        tvDisplay10.setText("Invalid input! Please enter month number between (1-12)");
                    }



            }
        });



        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sAmount = editText13.getText().toString();
                amount = Integer.parseInt(sAmount);

                if (amount >= 500) {
                    note500 = amount/500;
                    amount = amount - note500 * 500;
                }
                if (amount >= 100) {
                    note100 = amount/100;
                    amount = amount - note100 * 100;
                }
                if (amount >= 50) {
                    note50 = amount/50;
                    amount = amount - note50 * 50;
                }
                if (amount >= 20) {
                    note20 = amount/20;
                    amount = amount - note20 * 20;
                }
                if (amount >= 10) {
                    note10 = amount/10;
                    amount = amount - note20 * 10;
                }
                if (amount >= 5) {
                    note5 = amount/5;
                    amount = amount - note5 * 5;
                }
                if (amount >= 2) {
                    note2 = amount/2;
                    amount = amount - note2 * 2;
                }
                if (amount >= 1) {
                    note1 = amount;
                }

                tvDisplay12.setText("You have: \n " + note500 + "x 500 taka note \n "
                        + note100 + "x 100 taka note \n "
                        + note50 + "x 50 taka note \n "
                        + note20 + "x 20 taka note \n "
                        + note10 + "x 10 taka note \n "
                        + note5 + "x 5 taka note \n "
                        + note2 + "x 2 taka note \n "
                        + note1 + "x 1 taka note \n ");

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sAngle1 = edtringle1.getText().toString();
                sAngle2 = edtringle2.getText().toString();
                sAngle3 = edtringle3.getText().toString();

                angle1 = Integer.parseInt(sAngle1);
                angle2 = Integer.parseInt(sAngle2);
                angle3 = Integer.parseInt(sAngle3);

                sumAngle = angle1 + angle2 + angle3;

                if (sumAngle == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
                    tvDisplay13.setText("Tringle is valid");
                } else {
                    tvDisplay13.setText("Tringle is Invalid");
                }

            }
        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s2angle1 = editText14a.getText().toString();
                s2angle2 = editText14b.getText().toString();
                s2angle3 =  editText14c.getText().toString();

                angle2a = Integer.parseInt(s2angle1);
                angle2b = Integer.parseInt(s2angle2);
                angle2c = Integer.parseInt(s2angle3);

                if (angle2a == angle2b && angle2a == angle2c && angle2b == angle2c) {
                    tvDisplay14.setText("Equilateral triangle.");
                } else {
                    tvDisplay14.setText("Isosceles triangle.");
                }


            }
        });


        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sbuyPrice = editText15buy.getText().toString();
                sSellPrice = editText15sell.getText().toString();
                buyPrice = Integer.parseInt(sbuyPrice);
                sellPrice = Integer.parseInt(sSellPrice);

                if (buyPrice < sellPrice) {
                    profitorloss = sellPrice - buyPrice;
                    tvDisplay15.setText("You Profit :" + profitorloss);
                } else if (sellPrice < buyPrice)  {
                    profitorloss = buyPrice - sellPrice;
                    tvDisplay15.setText("You lost :" + profitorloss);
                } else {
                    tvDisplay15.setText("No Profit. No Loss");
                }

            }
        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sPhysics = editText16phy.getText().toString();
                sChemistry = editText16chem.getText().toString();
                sMath = editText16math.getText().toString();

                physics = Integer.parseInt(sPhysics);
                chemistry = Integer.parseInt(sChemistry);
                math = Integer.parseInt(sMath);

                totalresult = (physics + chemistry + math) / 3.0;

                if (totalresult >= 80) {
                    tvDisplay16.setText(" You got A+ ");
                }
                if (totalresult >= 70 && totalresult <=79) {
                    tvDisplay16.setText(" You got A ");
                }
                if (totalresult >= 60 && totalresult <=69) {
                    tvDisplay16.setText(" You got A- ");
                }
                if (totalresult >= 50 && totalresult <=59) {
                    tvDisplay16.setText(" You got B ");
                }
                if (totalresult >= 40 && totalresult <=49) {
                    tvDisplay16.setText(" You got C ");
                }
                if (totalresult >= 33 && totalresult <=39) {
                    tvDisplay16.setText(" You got D ");
                }
                if (totalresult < 33) {
                    tvDisplay16.setText(" You are Failed ");
                }



            }
        });




    }
}
