# fontawesomeOnAndroid
A way to use the fantastic Fontawesome Icons inside the Android projects

**This small snippet is based on FontAwesome 4.3**

## Install
To begin you must download the font-awesome.zip from fontawesome-webfont.ttf from http://fortawesome.github.io/Font-Awesome/.

After you have downloaded it, you must extract the **fontawesome-webfont.ttf** file and put it inside your *assets* project's folder. 

If you haven't this folder, you must create it.

Then, copy the *font_awesome.xml* file inside the same folder of your *string.xml* files

After that copy the soruce of FontAwesomeUtils.java inside a one package of your project.

**Once time that you have copied this file you must change the package string of this class**

## Use
This is an example of use. Inside one of yours layout files create a new widget like this one, and instead of *"@string/fa_paper_plane"* put the desidered icon name

**The name of all icons is the same of original library but instead of "-" you must write "_"**


**Currently, you could apply the font only on TextView, EditText or Button**


```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/fa_paper_plane"
    android:textSize="20sp"
    android:id="@+id/button"
    android:layout_gravity="center_horizontal" />
```

Then, after you have created your widget, inside your fragment or your activity put this code:

```java
    Button button = (Button) rootView.findViewById(R.id.button);
    FontAwesomeUtils.setAwesome(button, getAssets(), "fontawesome-webfont.ttf");
```

Then compile and run app and see the **magic**.

**Unfortunately you cannot see the *"magic"* from the AndoridStudio ui drawer**
