function studentSave() {

    var firstname = $('#firstname').val();
    var lastname = $('#lastname').val();
    var address = $('#address').val();
    var city = $('#city').val();
    var statee = $('#statee').val();
    var job = $('#job').val();
    var titlee = $('#titlee').val();
    var comname = $('#comname').val();
    var phone = $('#phone').val();
    var email = $('#email1').val();
    alert(email + "," + firstname + "," + statee);
    $.ajax({
        data: {firstname: firstname, lastname: lastname, address: address, city: city, statee: statee,job:job,titlee:titlee,comname:comname,phone:phone,email1:email1},
        url: 'CustomerRegisterController/saveCustomer',
        type: 'post',
        dataType: 'json',
        success: function (data) {
            $('#Amount').val(data.hello);

            // $('#hello').val(data.sasindu);
        }
    });
}

function saveValues()
{
    var firstname = $('#firstname').val();
    var lastname = $('#lastname').val();
    var address = $('#address').val();
    var city = $('#city').val();
    var statee = $('#statee').val();
    var job = $('#job').val();
    var titlee = $('#titlee').val();
    var comname = $('#comname').val();
    var phone = $('#phone').val();
    var email = $('#email1').val();


    var Customer = {
        "cusid" : 0,
        "firstname" :firstname,
        "lastname" :lastname,
        "address" :address,
        "city" :city,
        "state" :statee,
        "job" :job,
        "title" :titlee,
        "company" :comname,
        "email" :email,
        "phonenumber" :phone
    }

    $.ajax({
        type: "POST",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url: "CustomerRegisterController/savePostMethod",
        data: JSON.stringify(Customer), // Note it is important
        success :function(result) {
            // do what ever you want with data
        }
    });
}