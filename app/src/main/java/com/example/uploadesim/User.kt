package com.example.uploadesim

class User {
    var edtFirstName:String = ""
    var edtLastName:String = ""
    var edtEmail:String = ""
    var edtPassword:String = ""
    var edtConfirm:String = ""
    var userId:String = ""
    var id:String = ""

    constructor(
        edtFirstName: String,
        edtLastName: String,
        edtEmail: String,
        edtPassword: String,
        edtConfirm: String,
        userId: String,
        id: String
    ) {
        this.edtFirstName = edtFirstName
        this.edtLastName = edtLastName
        this.edtEmail = edtEmail
        this.edtPassword = edtPassword
        this.edtConfirm = edtConfirm
        this.userId = userId
        this.id = id
    }
}

