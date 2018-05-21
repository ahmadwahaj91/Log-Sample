# Project Title

Log Utilities Sample    

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### How to Use (Usage Sample)

A step by step series of examples that tell you have to get a development env running

do it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	}
	 }
```

Add the dependency

```
dependencies {
	implementation 'com.github.User:Repo:Tag'
	}
```

End with an example of getting some data out of the system or using it for a little demo

Define a view in your layout file:

```
 <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    tools:context="com.db.circularanimateddrawable.MainActivity">

    <com.db.circularanimateddrawable.widgets.CircularProgressButton
        android:id="@+id/progressButton"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:layout_gravity="center"
        android:layout_margin="@dimen/margin"
        android:layout_marginEnd="@dimen/margin"
        android:layout_marginLeft="@dimen/margin"
        android:layout_marginRight="@dimen/margin"
        android:layout_marginStart="@dimen/margin"
        android:background="@color/colorPrimary"
        android:gravity="center"
        android:textSize="17sp"
        android:text="@string/circular_text"
        android:textColor="@color/white"
        android:textStyle="bold"
        app:finalCornerAngle="100dp"
        app:initialCornerAngle="50dp"
        app:spinning_bar_color="@color/colorPrimary"
        app:spinning_bar_padding="@dimen/padding_smallest"
        app:spinning_bar_width="4dp" />

</LinearLayout>

```

And (or) add following code to your activity:

```
public class MainActivity extends AppCompatActivity {
    CircularProgressButton circularProgressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressButton = findViewById(R.id.progressButton);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // circularProgressButton.revertAnimation();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        circularProgressButton.revertAnimation(new OnAnimationEndListener() {

                            @Override
                            public void onAnimationEnd() {
                                Toast.makeText(getBaseContext(), "Animation End", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                }, 15000);
                circularProgressButton.startAnimation();
            }
        });
    }
    }

```

## Authors

* **Ahmad Wahaj** - *Initial work* - [PurpleBooth](https://github.com/ahmadwahaj91)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


