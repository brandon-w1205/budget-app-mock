# What image do you want to start building on?
FROM node:latest


# Tell your container where your app's source code will live
WORKDIR /vue-front

COPY package*.json ./

RUN npm install

COPY . .

# Does your app have any dependencies that should be installed?
RUN npm run build

# What port will the container talk to the outside world with once created?
EXPOSE 5173

# How do you start your app?
CMD [ "npm", "run", "dev" ]
