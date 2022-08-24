package com.something.extension;

import android.widget.Toast;

import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.util.YailList;

import io.shreyash.rush.Rename;

public class Toasts extends AndroidNonvisibleComponent {

  public Toasts(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleProperty
  public int Short() {
    return Toast.LENGTH_SHORT;
  }

  @SimpleProperty
  public int Long() {
    return Toast.LENGTH_LONG;
  }

  @SimpleFunction
  public void Toast(@Rename(name = "item names") YailList list,
                    @Rename(name = "duration of toast") int duration) {
    for (String name : list.toStringArray()) {
      Toast.makeText(form, name, duration)
              .show();
    }
    Toasted(list);
  }

  @SimpleEvent
  public void Toasted(@Rename(name = "toasted names") YailList list) {
    EventDispatcher.dispatchEvent(this, "Toasted", list);
  }
}
