package com.ookbee.sample2waybinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class RoomModel(
        @get:Bindable
        var title: String,
        @get:Bindable
        var desc: String
) : BaseObservable()