![MavenBadge](https://maven-badges.herokuapp.com/maven-central/dev.assemblage/extended-auto-complete/badge.svg)

## Extended Auto Complete
Custom view extending AppCompatAutoComplete.
In the default AutoCompleteTextView/AppCompatAutoComplete the suggestion drop-down only after typing in a couple of letters where as ExtendedAutoCompleteTextView shows the suggestion drop-down only by clicking or on touch.
 
## Installation

```groovy
implementation("dev.assemblage:extended-auto-complete:$sdkVersion")
```
replace `$sdkVersion` with the latest version of the SDK

## Usage

Declare the view as shown below in the XML file of your activity or fragment. 

```xml
  <dev.assemblage.extendedautocomplete.ExtendedAutoCompleteTextView
      android:id="@+id/auto_text_view"
      android:layout_width="match_parent"
      android:layout_height="48dp"/>
      
```

Populate the contents in the dropdown in your Java or Kotlin code as below

```java
    ArrayList<String> stringArrayList = new ArrayList<>();
    stringArrayList.add("Apple");
    stringArrayList.add("Banana");
    stringArrayList.add("Cherry");
    stringArrayList.add("Dates");
    stringArrayList.add("Elderberry");
    stringArrayList.add("Fig");
    stringArrayList.add("Grapefruit");

    ExtendedAutoCompleteTextView extendedAutoCompleteTextView =
        (ExtendedAutoCompleteTextView) findViewById(R.id.auto_text_view);
    ArrayAdapter<String> adapter =
        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stringArrayList);
    extendedAutoCompleteTextView.setAdapter(adapter);
```
