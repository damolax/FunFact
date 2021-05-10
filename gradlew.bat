<?xml version="1.0" encoding="utf-8"?>
<!--
     Copyright (C) 2020 The Android Open Source Project

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
-->
<merge xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:app="http://schemas.android.com/apk/res-auto"
  android:id="@+id/material_timepicker_container"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content">

  <include
    android:id="@+id/material_clock_display"
    layout="@layout/material_clock_display" />

  <include
    android:id="@+id/material_clock_period_toggle"
    layout="@layout/material_clock_period_toggle" />

  <com.google.android.material.timepicker.ClockFaceView
    android:id="@+id/material_clock_face"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginTop="36dp"
    android:layout_gravity="center"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintTop_toBottomOf="@+id/material_clock_display" />

</merge>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              