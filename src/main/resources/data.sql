insert into oauth_client_details (client_id, client_secret, scope, authorized_grant_types, authorities, access_token_validity, additional_information)
VALUES
  ('my-client-id', '$2a$10$PUAY4YbwnimRly2GsWVK2e9ZxQNqJIBhaz0wrY8B/cUU9sHfdP8Uq', 'read,write', 'password,client_credentials', 'ROLE_CLIENT', 300, '{"anyProperty":"anyValue"}');