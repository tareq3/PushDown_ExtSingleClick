# PushDown_ExtSingleClick
It is a lib for using singleClickListener and PushDown Anim Together 
# Dependencies:

### needed repository:
```

        maven { url 'https://jitpack.io' }
```
### needed dependencies:
```
    implementation 'com.github.tareq3:PushDown_ExtSingleClick:1.0'
```


## How to Use Without Anim:


        SingleClick.get(findViewById(R.id.mButton)).setOnSingleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Clicked ", Toast.LENGTH_SHORT).show();
              
            }
        });

## How to Use SingleclikListener with push-anim by Thai android developer.=>[ push down animation click](https://github.com/TheKhaeng/pushdown-anim-click?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=6821)

//Todo: With Anim Single Click Listener
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.mButton)).setOnSingleClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Clicked ", Toast.LENGTH_SHORT).show();
                
            }
        });

# For more push Animation Docs please visit [ HERE](https://github.com/TheKhaeng/pushdown-anim-click?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=6821) .


Creadit: 
I used [ push down animation click](https://github.com/TheKhaeng/pushdown-anim-click?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=6821)  library by Thai Android developer as a base for development.
