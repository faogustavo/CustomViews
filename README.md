# CustomViews

A short way to implement Square and Scaled view on android.

## INSTALL

Add this dependecy from jCenter:

``` groovy
compile 'com.gustavofao:CustomViews:1.1'
```
## USAGE

For a Square View:
``` xml
<!-- Using Relative Layout -->
<com.gustavofao.customviews.SquareFrameLayout
    android:id="@+id/Square"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/colorPrimaryDark"
    custom:base="width"/>

<!-- Using Frame Layout -->
<com.gustavofao.customviews.SquareFrameLayout
    android:id="@+id/Square"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/colorPrimaryDark"
    custom:base="width"/>
```

For a ScaledView:
``` xml
<!-- Using Relative Layout -->
<com.gustavofao.customviews.ScaledRelativeLayout
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  custom:base="width"
  custom:heightScale="9"
  custom:widthScale="16"
  android:background="@color/colorAccent"/>

<!-- Using Frame Layout -->
<com.gustavofao.customviews.ScaledFrameLayout
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  custom:base="width"
  custom:heightScale="9"
  custom:widthScale="16"
  android:background="@color/colorAccent"/>
```

## SAMPLE
This library test can be found on [this link](https://github.com/faogustavo/CustomViews/blob/master/sample/src/main/res/layout/activity_main.xml).

## SCREENSHOTS
![](/screenshots/tela_01.png)
![](/screenshots/tela_02.png)

## UPDATES
### 1.0
- Project start with SquareRelativeLayout and ScaledRelativeLayout.

### 1.1
- Added SquareFrameLayout and ScaledFrameLayout.

## License
    Copyright 2015 Gustavo Fão. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
