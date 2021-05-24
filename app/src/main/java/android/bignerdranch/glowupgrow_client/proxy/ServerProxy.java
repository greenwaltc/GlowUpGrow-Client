package android.bignerdranch.glowupgrow_client.proxy;

import com.google.gson.Gson;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class ServerProxy {
    HttpURLConnection connection;

    public ServerProxy() {}

    public ServerProxy(URL url) {
        try {
            setConnection((HttpURLConnection) url.openConnection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * login() // login an existing user
     * sends a request to the server to login a user and receives the result
     */
    public LoginResult login(LoginRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupPOSTRequest();
        String response = handleConnection(json);

        // Decode response data and return result
        LoginResult result = gson.fromJson(response, LoginResult.class);

        return result;
    }

    /**
     * register() // register a new user
     * sends a request to the server to register a user and receives the result
     */
    public RegisterResult register(RegisterRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupPOSTRequest();
        String response = handleConnection(json);

        // Decode response data and return result
        RegisterResult result = gson.fromJson(response, RegisterResult.class);

        return result;
    }

    /**
     * createTerrarium() // create a new live terrarium and assign it to a user
     * sends a request to the server to create a terrarium and receives the result
     */
    public GetTerrResult createTerrarium(CreateTerrRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupPOSTRequest();
        String response = handleConnection(json);

        // Decode response data and return result
        GetTerrResult result = gson.fromJson(response, GetTerrResult.class);

        return result;
    }

    /**
     * updateTerrarium() // update an existing terrarium with a new plant
     * sends a request to the server to update an existing terrarium and receives the result
     */
    public UpdateTerrResult updateTerrarium(UpdateTerrRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupPUTRequest();
        String response = handleConnection(json);

        // Decode response data and return result
        UpdateTerrResult result = gson.fromJson(response, UpdateTerrResult.class);

        return result;
    }

    /**
     * getTerrariums() // get all live terrariums belonging to a user
     * sends a request to the server to get all terrariums belonging to a user
     *   and receives the result
     */
    public GetTerrsResult getTerrariums(GetTerrsRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupGETRequest(request.getAuthToken());
        String response = handleConnection(json);

        // Decode response data and return result
        GetTerrsResult result = gson.fromJson(response, GetTerrsResult.class);

        return result;
    }

    /**
     * getTerrarium() // get a single live terrarium belonging to a user
     * sends a request to the server to get a single terrarium belonging to a user
     *   and receives the result
     */
    public GetTerrResult getTerrarium(GetTerrRequest request) {
        if (connection == null) return null;

        // Create JSON request string and send request to the server
        Gson gson = new Gson();
        String json = gson.toJson(request);

        setupGETRequest(request.getAuthToken());
        String response = handleConnection(json);

        // Decode response data and return result
        GetTerrResult result = gson.fromJson(response, GetTerrResult.class);

        return result;
    }

    /**
     * handleConnection()
     * sends a json request string to the server and receives a json response string
     */
    private String handleConnection(String json) {
        try {
            // Setup connection
            connection.setDoOutput(true);

            if (connection.getRequestMethod().equals("POST")) {
                // Write JSON to connection
                OutputStream os = new BufferedOutputStream(connection.getOutputStream());
                os.write(json.getBytes());
                os.flush();
                connection.getOutputStream().close();
            }

            BufferedReader br = null;

            // Response came back ok
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream successStream = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(successStream));
            }
            else if (connection.getResponseCode() == HttpURLConnection.HTTP_BAD_REQUEST) {
                InputStream errorStream = connection.getErrorStream();
                br = new BufferedReader(new InputStreamReader(errorStream));
            }

            // Store input into a string
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();

            String response = sb.toString();
            return response;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * setupPOSTRequest()
     * sets the request method of the connection to "POST"
     */
    private void setupPOSTRequest() {
        try {
            connection.setRequestMethod("POST");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }

    /**
     * setupPUTRequest()
     * sets the request method of the connection to "POST"
     */
    private void setupPUTRequest() {
        try {
            connection.setRequestMethod("PUT");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }

    /**
     * setupGETRequest()
     * sets the request method of the connection to "GET"
     */
    private void setupGETRequest(String authTokenStr) {
        try {
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", authTokenStr);
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
    }

    public void setConnection(HttpURLConnection connection) {
        this.connection = connection;
    }
}
