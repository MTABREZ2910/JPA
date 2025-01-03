async function submitForm(event) {
    event.preventDefault(); // Prevent default form submission

    // Collect form data
    const email = document.getElementById("email").value;
    const fullName = document.getElementById("fullName").value;

    // Send data to the backend
    const response = await fetch('/customers/insert', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, fullName }),
    });
    if (response.ok) {
        alert("Customer added successfully!");
    } else {
        alert("Error adding customer.");
    }
}