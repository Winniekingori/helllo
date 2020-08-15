package com.example.helllo

Data class RgistrationResponse(
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)