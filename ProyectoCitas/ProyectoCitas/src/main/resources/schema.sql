CREATE TABLE IF NOT EXISTS citas2 (
                                     id SERIAL PRIMARY KEY,
                                     doctor_name VARCHAR(100),
                                     patient_name VARCHAR(100),
                                     appointment_date TIMESTAMP,
                                     description TEXT
);
