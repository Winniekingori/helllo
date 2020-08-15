package com.example.helllo

data class Student(
    @SerializedName("student_id") var studentId: String,
    @SerializedName("first_name") var firstName: String,
    @SerializedName("last_name") var lastName: String,
    @SerializedName("email") var email: String,
    @SerializedName("phone_number") var phoneNumber: String
)
