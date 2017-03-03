package fr.dauburger.utils;

import java.util.HashMap;

public class Routes {
	private static HashMap<String, String> routes;

    public static final String home = "/accueil";
    public static final String login = "/login";
    public static final String logout = "/logout";
    public static final String plat = "/plats";

    public static final String add = "/add";
    public static final String edit = "/edit";
    public static final String del ="/del";
    public static final String list = "/list";
    
    private static void setRoutes()
    {       
        if(routes == null)
        {
            routes = new HashMap<String, String>();

            routes.put("home", home);
           
            setRoutesEntity("plat",Routes.plat);
            
            
        }
    }   

    public static void setRoutesEntity(String nomRoute, String route)
    {    	
    	routes.put(nomRoute, route);
    	routes.put(nomRoute + "list", route + list);
    	routes.put(nomRoute + "add", route + add);
        routes.put(nomRoute + "del", route + del);
        routes.put(nomRoute + "edit", route + edit);
  
    }
    public static HashMap<String, String> getRoutes()
    {
        setRoutes();

        return routes;
    }

    public static String getRoute(String destin)
    {
        setRoutes();

        return routes.get(destin);
    }

}	
