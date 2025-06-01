INSERT INTO product (
    product_name, product_code, release_date,
    description, price, star_rating, image_url
) VALUES
('Leaf Rake', 'GDN-0011', '2025-03-19', 'Leaf rake with 48-inch wooden handle.', 19.95, 3.2, 'assets/images/leaf_rake.png'),
('Garden Cart', 'GDN-0023', '2025-03-18', '15 gallon capacity rolling garden cart', 32.99, 4.2, 'assets/images/garden_cart.png'),
('Hammer', 'TBX-0048', '2025-05-21', 'Curved claw steel hammer', 8.90, 4.8, 'assets/images/hammer.png'),
('Saw', 'TBX-0022', '2025-05-15', '15-inch steel blade hand saw', 11.55, 3.7, 'assets/images/saw.png'),
('Video Game Controller', 'GMG-0042', '2025-05-15', 'Standard two-button video game controller', 35.95, 4.6, 'assets/images/xbox-controller.png')
ON CONFLICT (product_name) DO NOTHING;
