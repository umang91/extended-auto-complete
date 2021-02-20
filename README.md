## Extended Auto Complete
Custom view extending AppCompatAutoComplete.
In the default AutoCompleteTextView/AppCompatAutoComplete the suggestion drop-down only after
 typing in a couple of letters where as ExtendedAutoCompleteTextView shows the suggestion drop-down only by clicking. 

## Installation
Add the below dependency in the app level `build.gradle`

```groovy
implementation("com.umang:extended-auto-complete:1.0.0")
```
## Usage

```
  <dev.assemblage.extendedautocomplete.ExtendedAutoCompleteTextView
      android:id="@+id/auto_text_view"
      android:layout_width="match_parent"
      android:layout_height="48dp"/>
      
```
