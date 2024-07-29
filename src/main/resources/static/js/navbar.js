document.addEventListener('DOMContentLoaded', function () {
    fetch('/partials/navbar.html') // URL relative to the static directory
        .then(response => response.text())
        .then(data => {
            document.getElementById('navbar').innerHTML = data;
            updateDateTime(); // Call your function if you have one
        })
        .catch(error => console.error('Error loading navbar:', error));
});
