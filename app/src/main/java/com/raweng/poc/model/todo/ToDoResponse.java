package com.raweng.poc.model.todo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class ToDoResponse {

	@SerializedName("Response")
	private List<ResponseItem> response;
	public List<ResponseItem> getResponse(){
		return response;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Response{" + 
			"response = '" + response + '\'' + 
			"}";
		}


	public static class ResponseItem{

		private int id;
		private boolean completed;
		private String title;
		private int userId;

		public int getId(){
			return id;
		}

		public boolean isCompleted(){
			return completed;
		}

		public String getTitle(){
			return title;
		}

		public int getUserId(){
			return userId;
		}

		@NotNull
		@Override
		public String toString(){
			return
					"ResponseItem{" +
							"id = '" + id + '\'' +
							",completed = '" + completed + '\'' +
							",title = '" + title + '\'' +
							",userId = '" + userId + '\'' +
							"}";
		}
	}
}

