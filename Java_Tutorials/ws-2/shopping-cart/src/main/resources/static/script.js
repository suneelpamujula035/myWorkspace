 function printShppingAddress()
 {
     if(document.getElementById('shippingAddress').checked)
     {
     var billingAddressLine1 = document.getElementById("billingAddressLine1").value;
     document.getElementById("shippingAddressLine1").value = billingAddressLine1;

     var billingAddressLine2 = document.getElementById("billingAddressLine2").value;
     document.getElementById("shippingAddressLine2").value = billingAddressLine2;

     var billingCity = document.getElementById("billingCity").value;
     document.getElementById("shippingCity").value = billingCity;

     var billingState = document.getElementById("billingState").value;
     document.getElementById("shippingState").value = billingState;

     var billingCountry = document.getElementById("billingCountry").value;
     document.getElementById("shippingCountry").value = billingCountry;

     var billingZipCode = document.getElementById("billingZipCode").value;
     document.getElementById("shippingZipCode").value = billingZipCode;
     }
 }

 function checkFields()
 {
     var total = document.getElementById("total").value;
     if(total==null||total=="")
     {
          alert("Please update your cart");
          return false;
     }

 }

 function calculations()
 {
    var price = document.querySelectorAll(".price");
    var quantity = document.querySelectorAll(".quantity");
    var total = document.querySelectorAll(".total");
    var row = document.getElementById("tbody");
    var tr = row.getElementsByTagName("tr");

    for (i = 0; i < tr.length-3; i++)
    {
        var qty=document.getElementById("tbody").rows[i].cells[4].getElementsByTagName('input')[0].value;
        if(qty==null||qty=="")
        {
             alert("Quantity is required");
             return false;
        }
    }

    var totalCost = [];
    for(var i=0;i<price.length;i++)
    {
        total[i].value = parseFloat(price[i].innerHTML)*parseInt(quantity[i].value);
        totalCost[i] = total[i].value;
    }
    subtotal.value = totalCost.reduce((a,c)=>{return parseInt(a)+parseInt(c)},0);
    totaltax.value = subtotal.value*0.1;
    grandtotal.value = parseInt(subtotal.value)+parseInt(totaltax.value);
}