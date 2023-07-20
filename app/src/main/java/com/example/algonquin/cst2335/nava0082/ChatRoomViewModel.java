package com.example.algonquin.cst2335.nava0082;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import com.example.algonquin.cst2335.nava0082.ChatMessage;
public class ChatRoomViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> chatMessages = new MutableLiveData< >();

}
