document.addEventListener("DOMContentLoaded", function () {
    const dropdowns = document.querySelectorAll(".nav-list li a");

    dropdowns.forEach(item => {
        item.addEventListener("click", function (event) {
            const submenu = this.nextElementSibling;
            if (submenu && submenu.classList.contains("dropdown-menu")) {
                event.preventDefault(); // Prevent default link action
                submenu.classList.toggle("active");
            }
        });
    });
});


    // Mobile sidebar toggle
    const sidebar = document.querySelector(".sidebar");
    const menuToggle = document.createElement("button");
    menuToggle.innerText = "☰";
    menuToggle.classList.add("menu-toggle");
    document.body.insertBefore(menuToggle, document.body.firstChild);
    
    menuToggle.addEventListener("click", function () {
        sidebar.classList.toggle("active");
    });

 // Wait for the DOM to load completely
document.addEventListener('DOMContentLoaded', function() {
    // Get the profile container and dropdown
    const profile = document.querySelector('.profile');
    const dropdown = document.querySelector('.profiledown');
    const closeButton = document.querySelector('.close-btn');

    // Toggle 'show' class when profile is clicked
    profile.addEventListener('click', function() {
        dropdown.classList.toggle('show');
    });

    // Close the dropdown when the close button is clicked
    closeButton.addEventListener('click', function(event) {
        event.stopPropagation(); // Prevent closing when clicking the close button
        dropdown.classList.remove('show'); // Close the dropdown
    });
});

